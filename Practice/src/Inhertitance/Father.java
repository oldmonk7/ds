package Inhertitance;



class Father implements Cloneable{

    int i = 1;
    int j = 10;

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }
    @Override
 protected Object clone() throws CloneNotSupportedException {
    	
    	return super.clone();
    }

}
