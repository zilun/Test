import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.sun.corba.se.impl.orb.ParserTable.TestBadServerIdHandler;

public class ListTest
{
    private static List<String> multiThreadList = new ArrayList<String>();

    /**
     * @param args
     */
    public static void main(String[] args)
    {
//        List<Integer> test1 = new ArrayList<Integer>();
//        test1.add(1);
//        test1.add(2);
//        test1.add(3);
//        
//        System.out.println(test1.subList(1, 3).size());
        
//        System.out.println("Test :: " + testBool());
        
//        String str = "ab";
//        
//        String[] temp = str.split("c");
//        
//        System.out.println(temp[0]);
//        try
//        {
//            String temp = byte2hex(initSecretKey("test"));
//            System.out.println(temp);
//        }
//        catch(Exception ex)
//        {
//            System.out.println(ex.getMessage());
//        }
        
        long s= 1393175784124L;
//        long s = System.currentTimeMillis();
        Date now=new Date(s);
        SimpleDateFormat f = new SimpleDateFormat("yyyy��MM��dd�� E kk��mm��ss��");
        System.out.println(f.format(now));
        
//        HashSet<String> a = new HashSet<String>();
//        a.add("1");
//        a.add("2");
//        a.add("1234556@cn.hotalk.com");
//        
//        System.out.println(strListToStr(a));
        
//        String b = a.toString();
//        System.out.println(b.substring(1, b.length()-1));
        
//        ArrayList<String> a = new ArrayList<String>();
//        a.add("1");
//        a.add("2");
//        System.out.println(a.toString());
//        System.out.println(a.subList(0, 1).toString());
        
//        multiThreadList.add("1");
//        multiThreadList.add("2");
//        multiThreadList.add("3");
//        multiThreadList.add(null);
//        
//        
//        List<String> mainThreadList = new ArrayList<String>(multiThreadList);
//        
//        new Thread(new Runnable()
//        {
//            
//            @Override
//            public void run()
//            {
//                multiThreadList.remove("1");
//                System.out.println("removed");
//            }
//        }).start();
//        
//        int i = 0;
//        while (100 != i)
//        {
//            for (String test : mainThreadList)
//            {
////                if ("1".equals(test))
////                {
//                    System.out.println(i + " :: " + test.toString());
////                }
//            }
//            
//            i++;
//        }
        
    }
    
    private static boolean testBool()
    {
        boolean isTest = true;
        return (isTest = false);
    }
    
//    /** 
//     * ��ʼ����Կ 
//     *  
//     * @return byte[] ��Կ  
//     * @throws Exception 
//     */  
//    private static byte[] initSecretKey(String password) throws Exception{  
//        //��������ָ���㷨��������Կ�� KeyGenerator ����  
//        KeyGenerator kg = null;  
//        try {  
//            kg = KeyGenerator.getInstance("AES");  
//        } catch (NoSuchAlgorithmException e) {  
//            e.printStackTrace();  
//            return new byte[0];  
//        }  
//        
//        SecureRandom sr = SecureRandom.getInstance("SHA1PRNG", "Crypto");  
//        sr.setSeed(password.getBytes());
//        //��ʼ������Կ��������ʹ�����ȷ������Կ��С  
//        //AES Ҫ����Կ����Ϊ 128  
//        kg.init(128, sr);  
//        //����һ����Կ  
//        SecretKey  secretKey = kg.generateKey();  
//        return secretKey.getEncoded();  
//    }
//    
//    private static String byte2hex(byte[] b)
//    {
//        // ������ת�ַ���
//        String stmp = "";
//        StringBuilder hs = new StringBuilder();
//        for (int n = 0; n < b.length; n++)
//        {
//            stmp = (java.lang.Integer.toHexString(b[n] & 0XFF));
//            if (stmp.length() == 1)
//            {
//                hs.append("0");
//            }
//            hs.append(stmp);
//        }
//        return hs.toString();
//    }
//    
//    private static String strListToStr(HashSet<String> ids)
//    {
//        if (null == ids || ids.isEmpty())
//        {
//            return null;
//        }
//        
//        StringBuilder strBuilder = new StringBuilder();
//        
//        for(String str : ids)
//        {
//            strBuilder.append("'").append(str).append("',");
//        }
//        
//        String tempStr = strBuilder.toString();
//        
//        return tempStr.substring(0, tempStr.length() - 1);
//    }

}
