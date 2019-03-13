package com.sankuai.web.solrtest;

import com.sankuai.web.Utils.SolrUtils;

public class Test {
    public static void main(String[] args) throws Exception {
        SolrUtils solr = new SolrUtils();
        solr.createSolrServer();
        solr.addDoc();
//        solr.deleteDocumentById();
//        solr.querySolr();

    }
}
