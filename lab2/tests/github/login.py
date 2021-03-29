import time

from selenium.webdriver.common.keys import Keys


def bad_login(driver):
    print("start bad_login")
    element = driver.find_element_by_xpath('/html/body/div[1]/header/div/div[2]/div[2]/a[1]')
    element.click()
    element = driver.find_element_by_id('login_field')
    element.send_keys("login")
    element = driver.find_element_by_id('password')
    element.send_keys("password")
    element.send_keys(Keys.ENTER)
    print("correct end")


def correct_login(driver):
    print("start correct_login")
    element = driver.find_element_by_xpath('/html/body/div[1]/header/div/div[2]/div[2]/a[1]')
    element.click()
    element = driver.find_element_by_id('login_field')
    element.send_keys("Ruxuge") #insert your login
    element = driver.find_element_by_id('password')
    element.send_keys("Ruxuge.123") #insert your password
    element.send_keys(Keys.ENTER)
    time.sleep(10)
    print("correct end")


def logout(driver):
    print("start logout")
    element = driver.find_element_by_xpath('/html/body/div[1]/header/div[7]/details/summary')
    element.click()
    time.sleep(3)
    element = driver.find_element_by_xpath('/html/body/div[1]/header/div[7]/details/details-menu/form/button')
    element.click()
    print("correct end")
