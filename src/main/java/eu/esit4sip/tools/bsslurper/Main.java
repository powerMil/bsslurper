package eu.esit4sip.tools.bsslurper;

import javax.swing.text.html.HTML;

public class Main {

    public static void main(String[] args) throws Throwable {
        Html_to_json_tags_version.main(args);
        Web_to_json_parser.main(args);
        Web_to_json_parser_ver2.main(args);
    }
}
