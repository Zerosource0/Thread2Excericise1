/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread2excericise1;

import java.net.URL;

/**
 *
 * @author marcj_000
 */
public class TesterClassB extends Thread {
    
    private final ByteLoader bl1 = new ByteLoader();
    private long count = 0;

    public long getCount() {
        return count;
    }
    
    private final String link;

    public TesterClassB(String link) {
        this.link = link;
        
    }
    
    @Override
    public void run()
    {
        byte[] b1 = bl1.getBytesFromUrl(link);
        
        
        
        for (byte b : b1) {
            count=count+b;
        }
    }
    
}
