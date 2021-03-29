import time


def bad_login(driver):
    print("start bad_login")
    element = driver.find_element_by_id('topLoginLink')
    element.click()
    element = driver.find_element_by_id('userEmail')
    element.send_keys("login")
    element = driver.find_element_by_id('userPass')
    element.send_keys("password")
    element = driver.find_element_by_id('se_userLogin')
    element.click
    print("correct end")


def bad_password(driver):
    print("start bad_password")
    element = driver.find_element_by_id('topLoginLink')
    element.click()
    element = driver.find_element_by_id('userEmail')
    element.send_keys("login@login.login")
    element = driver.find_element_by_id('userPass')
    element.send_keys("password")
    element = driver.find_element_by_id('se_userLogin')
    element.click
    print("correct end")
