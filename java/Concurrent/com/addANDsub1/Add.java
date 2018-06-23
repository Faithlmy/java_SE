package com.addANDsub1;

public class Add implements Runnable {
    private Count count;
    public Add(Count count){
        this.count=count;
    } 

    @Override
    public void run() {
        while(true){
            count.add();
        }

    }

}
