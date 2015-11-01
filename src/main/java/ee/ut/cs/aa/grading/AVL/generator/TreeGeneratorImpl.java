package ee.ut.cs.aa.grading.AVL.generator;

public class TreeGeneratorImpl implements TreeGenerator {

    private int i;

    public TreeGeneratorImpl(){
        i = 1;
    }
    @Override
    public String generate(int n) {
        i = 1;
        return genHelper(n);
    }

    private String genHelper(int n) {
        if (n ==0){
            return "";
        }
        double random = Math.random();
        int lHeight = n - 1;
        int rHeight = n - 1;
        if (random < 0.3333 && lHeight > 0){
            lHeight--;
        }
        else if (random < 0.66666 && rHeight > 0){
            rHeight--;
        }
        String leftValue = genHelper(lHeight);
        int key = i++;
        String rightValue = genHelper(rHeight);
        return "[" + Integer.toString(key)+","+ Character.toString((char) (key+64)) + "] ("+leftValue+") ("+rightValue+")";
    }

    public static void main (String[] args){
        System.out.println(new TreeGeneratorImpl().generate(3));
    }


}
