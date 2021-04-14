/**
 * class calculator.
 *
 * @author ami
 * @version 0.1
 */
public class calculator
{
    // operan 1 & 2 untuk aplikasi calculator
    public int opA=0, opB=0;
    // informasi tentang class
    public static final String info="Aplikasi Kalkulator by ami";

    /**
     * Constructor for objects of class calculator dengan parameter
     */
    public calculator(int opA, int opB)
    {
        this.opA = opA;
        this.opB = opB;
        System.out.println("obyek calculator dengan parameter telah dibuat");
    }
    
    /**
     * Constructor for objects of class calculator tanpa parameter
     */
    public calculator()
    {
        System.out.println("obyek calculator tanpa parameter telah dibuat");
    }

    /**
     * penjumlahan
     *
     * @param int operan 1
     *        int operan 2
     * @return int hasil penjumlahan operan 1 + operan 2
     */
    public int penjumlahan(int opA, int opB)
    {
        return opA + opB;
    }
   
    /**
     * pengurangan
     *
     * @param int operan 1
     *        int operan 2
     * @return int hasil pengurangan operan 1 - operan 2
     */
    public int pengurangan(int opA, int opB)
    {
        return opA - opB;
    }

    /**
     * perkalian
     *
     * @param int operan 1
     *        int operan 2
     * @return int hasil perkalian operan 1 * operan 2
     */
    public int perkalian(int opA, int opB)
    {
        return opA * opB;
    }
   
    /**
     * pembagian
     *
     * @param int operan 1
     *        int operan 2
     * @return int hasil pembagian operan 1 / operan 2
     */
    public int pembagian(int opA, int opB)
    {
        return opA / opB;
    }

}