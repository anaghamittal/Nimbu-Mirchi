import java.util.*;
import java.io.*;
class StockFile implements Stock
{
    public static double total=0.0; 
    public double pricev[]={10,20,50,20,30,30,200,45,200,200,30,10,50,20,10,20,30,10,40,10};
    public double pricef[]={180,20,190,140,160,50,60,100,69,40,80,100,60,45,200,1000,120,60,400,240};
    public static String v[]={"Tomato","Potato","Onion","Cabbage","Cauliflower","Brinjal","Broccoli","Capsicum","Bell Pepper(Green)","Bell Pepper(Yellow)","Bottleguard","Bitterguard","Beans","Pumpkin","Cucumber","Carrot","Radish","Lady finger","Mushroom","Beetroot"};
    public static String f[]={"Apple","Banana","Mango","Strawberry","Pomegrate","Watermelon","Melon","Litchi","Orange","Cheeku","Kiwi","Mosambi","Sugarcane","Grapes","Blueberry","Raspberry","Pineapple","Guava","Peach","Plum"};
    public void vegetables()throws IOException
    {
        BufferedWriter bw1=new BufferedWriter(new FileWriter("StockVeggies.txt"));
        BufferedWriter bw3=new BufferedWriter(new FileWriter("StockVeggiesQuantity.txt"));
        BufferedWriter bw5=new BufferedWriter(new FileWriter("VeggiesPrice.txt"));
        for(int i=0;i<20;i++)
        {
            bw1.write(v[i]);
            bw1.newLine();
            bw3.write("100");
            bw3.newLine();
            bw5.write(Double.toString(pricev[i]));
            bw5.newLine();
        }
        bw5.close();
        bw3.close();
        bw1.close();
    }
    public void fruits()throws IOException
    {
        BufferedWriter bw2=new BufferedWriter(new FileWriter("StockFruits.txt"));
        BufferedWriter bw4=new BufferedWriter(new FileWriter("StockFruitsQuantity.txt"));
        BufferedWriter bw6=new BufferedWriter(new FileWriter("FruitsPrice.txt"));
        for(int i=0;i<20;i++)
        {
            bw2.write(f[i]);
            bw2.newLine();
            bw4.write("100");
            bw4.newLine();
            bw6.write(Double.toString(pricef[i]));
            bw6.newLine();
        }
        bw6.close();
        bw4.close();
        bw2.close();
    }
    public static void main(String args[])throws IOException
    {
            StockFile obj=new StockFile();
            obj.vegetables();
            obj.fruits();
    }
}
