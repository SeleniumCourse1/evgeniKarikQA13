package com.telRan.selenium.tests;

        import org.testng.Assert;
        import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase{

    @Test
    public void deletionGroupTest(){
        app.getNavigationHelper().goToGroupsPage();
        if(! app.getGroupHelper().isGroupExist()){
            app.getGroupHelper().createGroup();
        }

        int before = app.getGroupHelper().getGroupCount();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupDeletion();
        app.getGroupHelper().returnToGroupsPage();
        int after = app.getGroupHelper().getGroupCount();
        Assert.assertEquals(after, before-1);


    }
}
