class UseGenerics {

    public static void main(String args[]) {  

        MyGen<Integer> m = new MyGen<Integer>();  

        m.set(1); // it works

        m.set("merit"); // throws compilation error
        System.out.println(m.get());
    }
}


class MyGen<T> {
    T var;

    void  set(T var) {
        this.var = var;
    }
    
    T get() {
        return var;
    }
}
