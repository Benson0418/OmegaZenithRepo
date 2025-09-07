package UltraPkg;

public class anotherFeatureForThisPkg{

    int a,b,c;
    anotherFeatureForThisPkg(int a,int b,int c){}

    @Override
    public String toString() {
        return "anotherFeatureForThisPkg{" +
                "a=" + a +
                '}';
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }
}
