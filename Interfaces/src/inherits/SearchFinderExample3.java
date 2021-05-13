package inherits;

public class SearchFinderExample3 {

	public static void main(String[] args) {
		SearchFindable sf = new SearchFinder();
		run(sf);
		
		BlobSearchFinder bsf = new BlobSearchFinder();
		run(bsf);
	}
	
	public static void run(SearchFindable sf) {
		sf.search("url �˻�");
		sf.find("text �˻�");
	}
}
