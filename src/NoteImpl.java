import NoteInterfaceModule.NoteInterfacePOA;




public class NoteImpl extends NoteInterfacePOA {
    public double getNote(short cin, String codeMatiere) {
        return Math.random()*10+10;
        //votre code;
    }

    @Override
    public void shutdown() { 
        
    }
}