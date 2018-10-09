/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.pay;

/**
 *
 * @author amsta5248
 */
public class NetPay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        int hours= 40;
        double wage= 5.00;
        double insurance= 2.00;
        double tax= 0.22;


        //algorthim to Netpay

        double netpay =(hours*wage- insurance )- tax*(hours*wage-insurance);

        System.out.println("Net pay is" + netpay +"$");
    }       
}
