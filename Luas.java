package praktikum1;
public class Luas{
	int lebar,luas,panjang;
	
	public Luas(int panjang,int lebar){
		this.panjang=panjang;
		this.lebar=lebar;
	}
	public void getLuas(){
		this.luas=  panjang+lebar;
	}
	public static void main(String[] args){
		Luas y=new Luas(2,2);
		System.out.println(y.panjang);
	}
}