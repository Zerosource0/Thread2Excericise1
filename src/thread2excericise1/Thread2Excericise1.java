/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread2excericise1;

/**
 *
 * @author marcj_000
 */
public class Thread2Excericise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Avilable Processors: " + Runtime.getRuntime().availableProcessors());   
        
//        TesterClassA a = new TesterClassA();
//        a.start();
//        Thread.sleep(2000);
//        System.out.println(a.getCount());
        
        long count =0;

        TesterClassB b1 = new TesterClassB("https://fronter.com/cphbusiness/design_images/images.php/Classic/login/fronter_big-logo.png");
        TesterClassB b2 = new TesterClassB("https://fronter.com/cphbusiness/design_images/images.php/Classic/login/folder-image-transp.png");
        TesterClassB b3 = new TesterClassB("https://fronter.com/volY12-cache/cache/img/design_images/Classic/other_images/button_bg.png");
        
        long start = System.nanoTime();
        
        b1.run();
        //b1.join();
        
        count = count + b1.getCount();
        
        b2.run();
        //b2.join();
        count = count + b2.getCount();    
        
        b3.run();
        //b3.join();
        count = count + b3.getCount();
        
        long end = System.nanoTime();
        System.out.println("Time Sequental: "+(end-start));
        
        System.out.println(count);
    }
    
}
//564181130     run                 9 digits
//690338172     join                9 digits
//4848357597    join               10 digits
//453108711     run                 9 digits
//3167295193    run modified       10 digits
//553398806     start modified      9 digits
//884080208     start modified      9 digits
//896171881 ´   run modified        9 digits


//Results doesnt make sence. Epected outcome; the start method would be faster than run.