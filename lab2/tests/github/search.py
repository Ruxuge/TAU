from selenium.webdriver.common.keys import Keys


def find_repository(driver):
    print("start find repository")
    element = driver.find_element_by_xpath('/html/body/div[1]/header/div[3]/div/div/form/label/input[1]')
    element.send_keys("Ruxuge/TAU")
    element.send_keys(Keys.ENTER)
    print("correct end")


def find_user(driver):
    print("start find_user")
    element = driver.find_element_by_xpath('/html/body/div[1]/header/div[3]/div/div/form/label/input[1]')
    element.send_keys("Ruxuge")
    element.send_keys(Keys.ENTER)
    print("correct end")
