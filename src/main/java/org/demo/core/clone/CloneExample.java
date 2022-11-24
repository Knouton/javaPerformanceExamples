package org.demo.core.clone;

public class CloneExample {

	public static void main(String[] args) throws Exception {
		try {
			Book book = new Book("War and Peace", "Leo Tolstoy");
			Book book2 = book.clone();
			System.out.println(book.toString());
			System.out.println(book2.toString());
		}
		catch(CloneNotSupportedException ex) {

			System.out.println("Cloneable not implemented");
		}
	}
	static class Book implements Cloneable {
		private String name;
		private Author author;

		public void setName(String n) {
			name=n;
		}
		public String getName() {
			return name;
		}

		public void setAuthor(String n) {
			author.setName(n);
		}
		public String getAuthor() {
			return author.getName();
		}

		Book(String name, String author){

			this.name = name;
			this.author = new Author(author);
		}

		public String toString() {

			return "Книга '" + name + "' (автор " +  author.name + ")";
		}

		public Book clone() throws CloneNotSupportedException {

			Book newBook = (Book) super.clone();
			newBook.author = (Author) author.clone();
			return newBook;
		}
	}

	static class Author implements Cloneable {

		private String name;

		public void setName(String n){
			name=n;
		}
		public String getName(){
			return name;
		}

		public Author(String name){

			this.name=name;
		}
		public Author clone() throws CloneNotSupportedException {

			return (Author) super.clone();
		}
	}
}
