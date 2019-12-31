package smpl.values;

/**
 * Available "built-in" SMPL Types
 * @author --group name--
 */
public enum SMPLType {
    INTEGER("int"),
    REAL("real"),
    BOOLEAN("bool"),
    PROCEDURE("procedure"),
    PAIR("pair");

    private final String docString;

    SMPLType(String docString) {
        this.docString = docString;
    }

    @Override
    public String toString() {
        return new String("<" + this.docString + ">");
    }
}