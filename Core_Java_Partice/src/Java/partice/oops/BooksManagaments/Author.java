package Java.partice.oops.BooksManagaments;


	public class Author {
	    private int id;
	    private String firstName;
	    private String lastName;

	    public Author(int id, String firstName, String lastName) {
	        this.id = id;
	        this.firstName = firstName;
	        this.lastName = lastName;
	    }

	    public int getId() {
	        return id;
	    }

	    public String getFirstName() {
	        return firstName;
	    }

	    public String getLastName() {
	        return lastName;
	    }

	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;

	        Author author = (Author) o;

	        return id == author.id;
	    }

	    @Override
	    public int hashCode() {
	        return id;
	    }

	    @Override
	    public String toString() {
	        return firstName + " " + lastName;
	    }
	}
