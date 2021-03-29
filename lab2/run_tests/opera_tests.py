import threading
import time
from selenium import webdriver
import logging


# logger = logging.getLogger('simple_example')
# logger.setLevel(logging.INFO)
# ch = logging.StreamHandler()
# ch.setLevel(logging.DEBUG)
# formatter = logging.Formatter('%(asctime)s - %(name)s - %(levelname)s - %(message)s')
# ch.setFormatter(formatter)
# logger.addHandler(ch)

def pop_up(driver):
    pop = 0
    while pop == 0:
        try:
            pop_button = driver.find_element_by_css_selector('.m0zy07y')
            pop = 1
        except:
            time.sleep(10)
            print("no element")
            pop = 0
            pop_button.click()

    print('pop are denide')


def pudelek_t():
    import tests.pudelek.donos as d
    import tests.pudelek.search as s
    import tests.pudelek.login as l

    url = 'https://www.pudelek.pl'
    driver = webdriver.Opera(executable_path='/home/ruxuge/Dokumenty/operadriver')
    driver.get(url)
    driver.maximize_window()
    element = driver.find_element_by_xpath('/html/body/div[3]/div/div[2]/div[3]/div/button[2]')
    element.click()
    # b = threading.Thread(target=pop_up(driver))
    # b.start()
    s.search_covid(driver)
    driver.get(url)
    l.bad_login(driver)
    driver.get(url)
    l.bad_password(driver)
    driver.get(url)
    d.send_correct_text_donos(driver)
    driver.close()


def olx_t():
    import tests.olx.login as l
    import tests.olx.search as s

    url = 'https://www.olx.pl/'
    driver = webdriver.Opera(executable_path='/home/ruxuge/Dokumenty/operadriver')
    driver.get(url)
    driver.maximize_window()
    element = driver.find_element_by_id('onetrust-accept-btn-handler')
    element.click()
    # b = threading.Thread(target=pop_up(driver))
    # b.start()
    l.bad_login(driver)
    driver.get(url)
    l.bad_password(driver)
    driver.get(url)
    s.search_car_with_category(driver)
    driver.get(url)
    s.search_car_without_category(driver)
    driver.get(url)


def github_t():
    # This test work properly only when you insert working login and password to login.py file in line 20 and 22.
    import tests.github.login as l
    import tests.github.search as s

    url = 'https://github.com/'
    driver = webdriver.Opera(executable_path='/home/ruxuge/Dokumenty/operadriver')
    driver.get(url)
    driver.maximize_window()
    # b = threading.Thread(target=pop_up(driver))
    # b.start()
    l.bad_login(driver)
    driver.get(url)
    l.correct_login(driver)
    s.find_repository(driver)
    driver.get(url)
    s.find_user(driver)
    driver.get(url)
    l.logout(driver)
