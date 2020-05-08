package py.lpz.nelson.pd.composite.article.solution;

import py.lpz.nelson.pd.composite.article.Article;

public class TreeArticlesLeaf implements TreeArticles {

    private Article article;

    public TreeArticlesLeaf(Article article) {
        this.article = article;
    }

    @Override
    public int id() {
        return this.article.getId();
    }

    @Override
    public String reference() {
        return this.article.getReference();
    }

    @Override
    public boolean isComposite() {
        return false;
    }

    @Override
    public void add(TreeArticles treeArticles) {
        // Do nothing because is leaf
    }

    @Override
    public void remove(TreeArticles treeArticles) {
        // Do nothing because is leaf
    }

}
