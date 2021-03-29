from selenium import webdriver
import logging
from selenium.webdriver.common.by import By
import time
import threading

logger = logging.getLogger('simple_example')
logger.setLevel(logging.INFO)
ch = logging.StreamHandler()
ch.setLevel(logging.DEBUG)
formatter = logging.Formatter('%(asctime)s - %(name)s - %(levelname)s - %(message)s')
ch.setFormatter(formatter)
logger.addHandler(ch)

url = 'https://www.zalando.pl'


def cookie_allow(driver):
    cookie = 0
    while cookie == 0:
        try:
            cookie_button = driver.find_element_by_id('uc-btn-accept-banner')
            cookie = 1
        except:
            time.sleep(10)
            print("no element")
            cookie = 0
            cookie_button.click()

    print('cookies are allow')


def bad_login(driver):
    element = driver.find_element_by_class_name('z-navicat-header_navToolItemLink')
    element.click()
    logger.info("Typing email and password")
    temp = driver.find_element_by_id('login.email')
    temp.send_keys("login")
    temp = driver.find_element_by_id('login.password')
    temp.send_keys("password")
    # element = driver.find_element_by_xpath=("//button[contains(.,'Zaloguj się')]")
    # element = driver.find_element_by_tag_name('arial_label')
    element = driver.find_element_by_css_selector('span.z-oVg8')
    element.click()
    driver.close()


# def add_to_cart(driver):


def main_function():
    driver = webdriver.Firefox(executable_path='/home/ruxuge/Dokumenty/geckodriver')
    driver.get(url)
    driver.maximize_window()
    x = threading.Thread(target=cookie_allow(driver))
    y = threading.Thread(target=bad_login(driver))
    y.start()
    x.start()
