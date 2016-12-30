/**

Class to create a clob object to be passed for DB.
Sample clob requirements
CLOB : id(9) name (15) dob (10)

**/
public class ClobBuilder{

public static void main(String[] args) {

String javaId="SampleId";
String javaName="SampleId";
String javaDate="SampleDate";

StringBuilder clobInput=new StringBuilder();

buildClobvalues(clobInput,javaId,9 );
buildClobvalues(clobInput,javaName,9 );
buildClobvalues(clobInput,javaDate,9 );

private void buildClobValues(StringBuilder sb, String attribute, int attrLength){

if(StringUtils.isBlank(attribute)){
for(int size=0;size<attrLength;size++){sb.append(" ");}
}else{
sb.append(attribute);
for(int size=0;size<attrLength-attribute.length();size++){sb.append(" ");}
}
}
}

}
