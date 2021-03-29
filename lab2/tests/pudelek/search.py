from selenium.webdriver.common.keys import Keys


def search_covid(driver):
    print("start search_covid")
    element = driver.find_element_by_css_selector('input.mZWCj')
    element.send_keys("covid")
    element.send_keys(Keys.ENTER)
    print("correct end")

