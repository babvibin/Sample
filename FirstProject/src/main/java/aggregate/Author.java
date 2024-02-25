package aggregate;

public class Author {
	String authorName;
	String place;
	Book b;
	public Author(String authorName,String place,Book b)
	{
		this.authorName=authorName;
		this.place=place;
		this.b=b;		
	}
	
	public void display()
	{
		System.out.println(b.name+ " " +b.year );
		System.out.println(authorName+ " " +place);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book c=new Book("Home Studies", 2023);
		Author a=new Author("James Blank","Alaska",c);
		a.display();
	}

}
