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
public class TesterClassA extends Thread{
   
    private ByteLoader bl1 = new ByteLoader();
    private long count = 0;

    public long getCount() {
        return count;
    }
    
    
    @Override
    public void run()
    {
        byte[] b1 = bl1.getBytesFromUrl("https://fronter.com/cphbusiness/design_images/images.php/Classic/login/fronter_big-logo.png");
        
        for (byte b : b1) {
            count++;
        }
    }
    
}
