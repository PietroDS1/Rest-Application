package br.com.pietro;

public class Greeting {

	private final long id;
	private final String content;
	/**
	 * @param id
	 * @param content
	 */
	public Greeting(long id, String content) {
		
		this.id = id;
		this.content = content;
	}
	public long getId() {
		return id;
	}
	public String getContent() {
		return content;
	}
	
	
}
