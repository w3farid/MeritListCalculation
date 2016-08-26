
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class Test {

    private String roll;
    private String name;
    private int marks;
    private int merit;

    private String[] stR = new String[3];
    private String[] stN = new String[3];
    private Integer[] stV = new Integer[3];
    private List<Test> mrt = new ArrayList<>();

    public Integer[] getStV() {
        return stV;
    }

    public void setStV(Integer[] stV) {
        this.stV = stV;
    }

    public Test(String roll, String name, int marks, int merit) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
        this.merit = merit;
    }

    public Test() {

    }

    public void doMerit() {
        Set<Integer> m = new HashSet<>();
        for (Integer p : stV) {
            m.add(p);
        }
        TreeSet<Integer> m1 = new TreeSet<>(m);
        TreeSet<Integer> m2 = new TreeSet<>();
        m2 = (TreeSet) m1.descendingSet();
        int c1 = 0;
        
        while(stN.length>c1){  
            int c = 0;
            for(Integer p:m2){
                 if(stV[c1] == p){
                     mrt.add(new Test(stR[c1], stN[c1], stV[c1], c+1));
                 }
                 c++;
            }
            c1++;
        }
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getMerit() {
        return merit;
    }

    public void setMerit(int merit) {
        this.merit = merit;
    }

    public String[] getStR() {
        return stR;
    }

    public void setStR(String[] stR) {
        this.stR = stR;
    }

    public String[] getStN() {
        return stN;
    }

    public void setStN(String[] stN) {
        this.stN = stN;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public List<Test> getMrt() {
        return mrt;
    }

    public void setMrt(List<Test> mrt) {
        this.mrt = mrt;
    }
}
