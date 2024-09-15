package collection;

import java.util.ArrayList;

public class author {
	String authorName;

	public author(String authorName) {
		this.authorName = authorName;
	}

	@Override
	public String toString() {
		return "author [authorName=" + authorName + "]";
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	}

