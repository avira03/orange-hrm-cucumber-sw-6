Feature: Verify the user page

  @sanity @smoke @regression
  Scenario: Admin should add user successfully
    Given I am on Login page
    When Login to Application
    And Enter login Username
    And Enter login Password
    And Click on login button
    And Click On Admin
    And Verify Text 'System Users'
    And Click On Add button
    And Verify Text for 'Add User'
    And Click on username dropdown
    And Select User Role Admin
    And Enter Employee Name Peter Mac Anderson
    And Enter Username
    And Click on status drop down
    And Select status Disable
    And Enter password
    And Enter Confirm Password
    And Click On Save Button
    Then Verify message for success "Successfully Saved"

  @smoke @regression
  Scenario: Search the user created and verify it
    Given I am on Login page
    When Login to Application
    And Enter login Username
    And Enter login Password
    And Click on login button
    And Click On Admin
    And Verify Text 'System Users'
    And Enter Username to add user
    And Click on Search Button
    #Then Verify the User should be in Result list.

  @regression
  Scenario: Verify that admin should delete the user successfully
    Given I am on Login page
    When Login to Application
    And Enter login Username
    And Enter login Password
    And Click on login button
    And Click On Admin
    And Verify Text 'System Users'
    And Enter Username to add user
    And Click on Search Button
    And Verify the User should be in Result list.
    And Click on Check box
    And Click on Delete Button
    And Popup will display
    And Click on Ok Button on Popup
    Then verify message "Successfully Deleted"

  @regression
  Scenario Outline: Search the user and verify the message record found
    Given I am on Login page
    When Login to Application
    And Enter login Username
    And Enter login Password
    And Click on login button
    And Click On Admin
    And Verify Text 'System Users'
    And Enter Username "<username>"
    And Select User Role "<userrole>"
#    And Enter EmployeeName "<employeeName>"
    And Select Status "<status>"
    And Click on Search Button
    And verify message "(1) Record Found"
#    And Verify username 'username'
    Then Click on Reset Tab
    Examples:
      | username | userrole | employeeName             | status |
      | Admin    | Admin    | paul Collings            | Enable |
      | chauthi  | ESS      | waleed baoud             | Enable |
      | JackRose | ESS      | Jack Rose (Past Employee | Enable |
      | VankoLe  | Admin    | waleed baoud             | Enable |
