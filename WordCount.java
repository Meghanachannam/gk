class WordCount
{
	public static void main(String[]args)
	{
		String sentence="Hello welcome to java class";
		String[]words=sentence.split(" ");
		String result=words[0]+" "+words[1]+" "+words[words.length-1];
		System.out.println("Output:"+result);
	}
}