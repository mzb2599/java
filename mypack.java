package mypack;
 public class detail
{
  public int p_id,p_q,p_price;
  public void getdata(int id,int qty,int price) {
  p_id=id;
  p_q=qty;
  p_price=price;
  }
  public void putdata() {
  System.out.println("Product is is :" +p_id);
  System.out.println("Product quantity is :"+p_qty);
  System.out.println("Product price is :"+p_price);        
}
}
