public class MyComplex {
    double real = 0.0, imag = 0.0;

    public MyComplex() {
        real = 0.0;
        imag = 0.0;
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.imag = imag;
        this.real = real;
    }

    public String toString() {
        return "(" + real + " + " + imag + " i)";
    }

    public boolean isReal() {
        return (this.real == 0);
    }

    public boolean isImag() {
        return (this.imag == 0);
    }
}
