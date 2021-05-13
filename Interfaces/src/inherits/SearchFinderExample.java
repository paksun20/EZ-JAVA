package inherits;

public class SearchFinderExample {

	public static void main(String[] args) {
		SearchFinder sf = new SearchFinder();
		run(sf);
		
		BlobSearchFinder bsf = new BlobSearchFinder();
		run(bsf);
	}
	
	public static void run(SearchFinder sf) {
		sf.search("url �˻�");
		sf.find("text �˻�");
	}
	
	public static void run(BlobSearchFinder sf) {
		sf.search("url �˻�");
		sf.find("text �˻�");
	}
}
