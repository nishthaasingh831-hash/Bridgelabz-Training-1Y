class DiscountCal {
public static void main(String[] args)
{
double fee=125000;
double discountPercent=10;
double discount=(fee*discountPercent)/100;
double finalfee=fee-discount;
System.out.println(" The discount amount is INR"+ discount);
System.out.println(" The final discounted fee is INR"+ finalfee);
}
}