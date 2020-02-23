package lab5Code.editor;
public class TestEditor {
	public static void main(String[] args) {
	DocumentInvoker myDocument = new DocumentInvoker ("callmemaybe");
	DocumentInvoker myDoc = new DocumentInvoker("another Callmemaybe");
	 myDocument.Write("Hey I just met you");
	 myDocument.Write("And this is crazy");
	 myDocument.Write("But here’s my number");
	 myDocument.Undo(0);
	 System.out.println(myDocument.Read());

	 myDoc.Write("Hey I just met you");
	 myDoc.Write("And this is crazy");
	 myDoc.Write("But here’s my number");
	 myDoc.Undo(2);
	 System.out.println(myDoc.Read());

	 myDoc.printCommandBuffer();
	 myDocument.printCommandBuffer();
	}

}
