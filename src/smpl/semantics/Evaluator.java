package smpl.semantics;

import java.util.ArrayList;
import java.util.Iterator;

import smpl.exceptions.VisitException;

import smpl.syntax.ast.core.SMPLProgram;
import smpl.syntax.ast.core.Statement;
import smpl.values.SMPLBool;
import smpl.values.SMPLValue;
import smpl.values.SMPLPair;
import smpl.syntax.ast.*;


public class Evaluator implements Visitor<Environment, SMPLValue<?>> {
    /* For this visitor, the argument passed to all visit
       methods will be the environment object that used to
       be passed to the eval method in the first style of
       implementation. */

    // allocate state here
    protected SMPLValue<?> result;	// result of evaluation

    public Evaluator() {
        // perform initialisations here
        result = SMPLValue.make(0);
    }

    public Environment getDefaultState() {
	    return Environment.makeGlobalEnv();
    }

    public SMPLValue<?> visitSMPLProgram(SMPLProgram p, Environment arg)
	throws VisitException {
        result = p.getSeq().visit(this, arg);
        return result;
    }

    public SMPLValue<?> visitStmtExp(StmtExp s, Environment arg)
    throws VisitException {
	    return s.getExp().visit(this, arg);
    }

    public SMPLValue<?> visitStmtSequence(StmtSequence sseq, Environment arg)
	throws VisitException {
        // remember that arg is the environment
        Statement s;
        ArrayList seq = sseq.getSeq();
        Iterator iter = seq.iterator();
        result = SMPLValue.make(0); // default result
        while(iter.hasNext()) {
            s = (Statement) iter.next();
            result = s.visit(this, arg);
        }
        // return last value evaluated
        return result;
    }

    @Override
    public SMPLValue<?> visitStmtAssignment(StmtAssignment sa, Environment env) throws VisitException {
        String id = sa.getVar();
        SMPLValue<?> pvalue = env.get(id);
        result = sa.getExp().visit(this, env);
        env.put(id, result);
        return result;
    }

    public SMPLValue<?> visitStmtDefinition(StmtDefinition sd, Environment env)
	throws VisitException {
        // Environment env = (Environment) arg;
        result = sd.getExp().visit(this, env);
        env.put(sd.getVar(), result);
        return result;
    }

    public SMPLValue<?> visitExpAdd(ExpAdd exp, Environment arg)
	throws VisitException {
        SMPLValue<?> val1, val2;
        val1 = exp.getExpL().visit(this, arg);
        val2 = exp.getExpR().visit(this, arg);
        return val1.add(val2);
    }

    public SMPLValue<?> visitExpSub(ExpSub exp, Environment arg)
	throws VisitException {
        SMPLValue<?> val1, val2;
        val1 = exp.getExpL().visit(this, arg);
        val2 = exp.getExpR().visit(this, arg);
        return val1.sub(val2);
    }

    public SMPLValue<?> visitExpMul(ExpMul exp, Environment arg)
	throws VisitException {
	    SMPLValue<?> val1, val2;
        val1 = exp.getExpL().visit(this, arg);
        val2 = exp.getExpR().visit(this, arg);
        return val1.mul(val2);
    }

    public SMPLValue<?> visitExpDiv(ExpDiv exp, Environment arg)
	throws VisitException {
        SMPLValue<?> val1, val2;
        val1 = exp.getExpL().visit(this, arg);
        val2 = exp.getExpR().visit(this, arg);
        return val1.div(val2);
    }

    public SMPLValue<?> visitExpMod(ExpMod exp, Environment arg)
	throws VisitException {
        SMPLValue<?> val1, val2;
        val1 = exp.getExpL().visit(this, arg);
        val2 = exp.getExpR().visit(this, arg);
        return val1.mod(val2);
    }

    public SMPLValue<?> visitExpLit(ExpLit exp, Environment arg)
	throws VisitException {
	    return exp.getVal();
    }

    public SMPLValue<?> visitExpVar(ExpVar exp, Environment env)
	throws VisitException {
        // remember that arg is really the environment
        //	Environment env = (Environment) arg;
        SMPLValue<?> val = env.get(exp.getVar());
        return val;
    }

    @Override
    public SMPLValue<?> visitExpBool(ExpBool exp, Environment arg) throws VisitException {
        return exp.getBool();
    }
    
    public SMPLValue<?> visitExpNeg(ExpNeg exp, Environment env) throws VisitException {
        SMPLValue<?> numval = exp.getExp().visit(this, env);
        return numval.neg();
    }

    public SMPLValue<?> visitExpPow(ExpPow exp, Environment arg)
	throws VisitException {
        SMPLValue<?> val, pow;
        val = exp.getExp().visit(this, arg);
        pow = exp.getPower().visit(this, arg);
        return val.pow(pow);
    }

    @Override
    public SMPLValue<?> visitExpRelOp(ExpRelOp exp, Environment arg) throws VisitException {
        SMPLValue<?> left, right;
        left = exp.getLeft().visit(this, arg);
        right = exp.getRight().visit(this, arg);
        String sign = exp.getSign();
        return left.cmp(right, sign);
    }

    @Override
    public SMPLValue<?> visitExpRelOps(ExpRelOps exp, Environment arg) throws VisitException {
        SMPLValue<?> status = SMPLValue.make(true);
        ArrayList<ExpRelOp> operations = exp.getOps();

        if (operations.size() < 1)
            return exp.getExp().visit(this, arg);

        for (ExpRelOp op: operations) {
            status = op.visit(this, arg);
            if (status.boolValue() == false) 
                break;
        }
        return status;
    }

    @Override
    public SMPLValue<?> visitExpAnd(ExpAnd exp, Environment arg) throws VisitException {
        SMPLValue<?> left, right;
        left = exp.getLeft().visit(this, arg);
        right = exp.getRight().visit(this, arg);
        return left.and(right);
    }

    @Override
    public SMPLValue<?> visitExpOr(ExpOr exp, Environment arg) throws VisitException {
        SMPLValue<?> left, right;
        left = exp.getLeft().visit(this, arg);
        right = exp.getRight().visit(this, arg);
        return left.or(right);
    }

    @Override
    public SMPLValue<?> visitExpNot(ExpNot exp, Environment arg) throws VisitException {
        SMPLValue<?> left;
        left = exp.getExp().visit(this, arg);
        return left.not();
    }

    @Override
    public SMPLValue<?> visitExpBAnd(ExpBAnd exp, Environment arg) throws VisitException {
        SMPLValue<?> left,right;
        left = exp.getLeft().visit(this,arg);
        right = exp.getRight().visit(this,arg);
        return  left.BAnd(right);
    }

    @Override
    public SMPLValue<?> visitExpBOr(ExpBOr exp, Environment arg) throws VisitException {
        SMPLValue<?> left,right;
        left = exp.getLeft().visit(this,arg);
        right = exp.getRight().visit(this,arg);
        return  left.BOr(right);
    }

    @Override
    public SMPLValue<?> visitExpPair(ExpPair exp, Environment arg) throws VisitException {
        SMPLValue<?> left,right;
        left = exp.getLeft().visit(this,arg);
        right = exp.getRight().visit(this,arg);
        return  new SMPLPair(left,right);
    }

    @Override
    public SMPLValue<?> visitExpCAR(ExpCAR exp, Environment arg) throws VisitException {
        SMPLValue<?> left;
        left = exp.getPair().getLeft();
        return  left;
    }

    @Override
    public SMPLValue<?> visitExpCDR(ExpCDR exp, Environment arg) throws VisitException {
        SMPLValue<?> right;
        right = exp.getPair().getRight();
        return right;
    }
}
