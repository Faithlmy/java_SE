package com.addANDsub1;

public class Sub implements Runnable {
    private Count count;
    public Sub(Count count){
        this.count=count;
    } 

    @Override
    public void run() {
        while(true){
            count.sub();
        }

    }

}
