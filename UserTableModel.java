package com.mycompany.registrationform;




import java.util.List;
import javax.swing.table.AbstractTableModel;


class UserTableModel extends AbstractTableModel {
    public static final int OBJECT_COL = -1;
    private static final int NAME_COL = 0;
    private static final int ADDRESS_COL = 1;
    private static final int EMAIL_COL = 2;
    private static final int AGERANGE_COL = 3;
    private static final int SLIDERCHOICE_COL = 4;
    private static final int GENDER_COL = 5;
    private static final int SOCIAL_COL = 6;
    private static final int SEARCH_COL = 7;
    private static final int FRIEND_COL = 8;
    private static final int OTHER_COL = 9;
    
    
    private String[] columnNames = {"Name", "Address", "Email", "Age Range", "Slider Choice", "Gender", "Social?", "Search?", "Friend?", "Other"};
    
    private List<User> users;
    
    public UserTableModel(List<User> theUsers){
        users = theUsers;
    }
    
    @Override
    public int getColumnCount(){
        return columnNames.length;
    }
    
    @Override 
    public int getRowCount(){
        return users.size();
    }
    
    @Override
    public String getColumnName(int col){
        return columnNames[col];

    }
    
    @Override 
    public Object getValueAt(int row, int col){
        User tempUser = users.get(row);
        
        switch(col){
            case NAME_COL:
                return tempUser.getfName() + " " + tempUser.getsName();
            case ADDRESS_COL:
                return tempUser.getAddress();
            case EMAIL_COL:
                return tempUser.getEmailAddress();
            case AGERANGE_COL:
                return tempUser.getAgeCat();
            case SLIDERCHOICE_COL:
                return tempUser.getSatisfaction();
            case GENDER_COL:
                return tempUser.getGender();
            case SOCIAL_COL:
                if(tempUser.isCheckSocialOn()){
                    return "Yes";
                }else{
                    return "No";
                }
            case SEARCH_COL:
                if(tempUser.isCheckGoogleOn()){
                    return "Yes";
                  
                }else{
                    return "No";
                }
            case FRIEND_COL:
                if(tempUser.isCheckFriendsOn()){
                    return "Yes";
                }else{
                    return "No";
                }
            case OTHER_COL:
                if(tempUser.isCheckOtherOn()){
                    return "Yes";
                }else{
                    return "No";
                }
                
            
            default:
                return tempUser;
        }
    }
    @Override
    public Class getColumnClass(int c){
        return getValueAt(0, c).getClass();
    }
}
