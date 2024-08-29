public class Buffer_Reader
{
    public static void main(String[] args) 
    {
        StringBuffer sb = new StringBuffer("Aryan"); // Buffersize - 16 Bytes    
        System.out.println(sb.capacity()); // Store name Aryan also gives 16 bytes data
        System.out.println(sb.length());

        sb.append(" Panchal");
        System.out.println(sb);

        String str = sb.toString(); // Convert the String buffer data

        sb.deleteCharAt(2); // delete chat
        System.out.println(sb);

        sb.insert(0,"Java ");
        System.out.println(sb);

        sb.setLength(30); // save the data add some extra data
        System.out.println(sb);

        sb.ensureCapacity(100);
    }   
}
