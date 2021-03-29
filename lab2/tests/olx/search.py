import time

from selenium.webdriver.common.keys import Keys


def search_car_with_category(driver):
    print("start search_car_with_category")
    element = driver.find_element_by_class_name('cat-icon-5')
    element.click()
    element = driver.find_element_by_xpath('/html/body/div[1]/section[1]/div[1]/div/div[2]/ul/li[2]/a/span')
    element.click()
    time.sleep(5)
    element = driver.find_element_by_xpath('//*[@id="search-text"]')
    element.send_keys('BMW')
    element.send_keys(Keys.ENTER)
    print("correct end")


def search_car_without_category(driver):
    print("search_car_without_category")
    element = driver.find_element_by_id('headerSearch')
    element.send_keys('BMW')
    element.send_keys(Keys.ENTER)
    #element = driver.find_element_by_xpath('/html/body/div[1]/div[3]/section/div[3]/div/div[1]/table[1]/tbody/tr[3]/td/div/table/tbody/tr[1]/td[1]')
    #element.click()
    print("correct end")
