package smpl.values;

import java.util.ArrayList;
import java.util.List;

import smpl.exceptions.SMPLException;

public class SMPLVector extends SMPLValue<SMPLVector> {

    List<SMPLValue<?>> elements;

    public SMPLVector() {
        this(new ArrayList<SMPLValue<?>>());
    }

    public SMPLVector(List<SMPLValue<?>> elements) {
        this.elements = elements;
    }

    /**
     * @return the elements
     */
    public List<SMPLValue<?>> getElements() {
        return elements;
    }

    @Override
    public SMPLValue<?> add(SMPLValue<?> arg) throws SMPLException {
        if (arg.isVector()) {
            this.elements.addAll(((SMPLVector)arg).getElements());
        } else {
            this.elements.add(arg);
        }
        return this;
    }

    @Override
    public SMPLType getType() {
        return SMPLType.VECTOR;
    }

    @Override
    public String toString() {
        String elStr = "[ ";
        for (int i = 0; i < elements.size() - 1; i++) {
            elStr += elements.get(i).toString() + ", ";
        }
        elStr += elements.get(elements.size() - 1);
        elStr += " ]";
        return new String(getType().toString() + elStr);
    }
}