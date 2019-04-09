package rocks.zipcode.io.quiz4.objectorientation;

/**
 * @author leon on 11/12/2018.
 */
public class StringAssembler {
    private Character delimeter;
    private String string = "";
    
    
    public StringAssembler(Character delimeter) {
        this.delimeter = delimeter;
    }

    public StringAssembler append(String str) {
        string += str + delimeter;
        return this;
    }

    public String assemble() {
        return string.substring(0, string.length()-1);
    }
}
