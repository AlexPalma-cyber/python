from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
import time

driver = webdriver.Chrome()
driver.get("https://www.google.com")
driver.get("https://es.wikipedia.org/wiki/Python")

web_element = driver.find_element(By.NAME, 'q')
web_element.send_keys("Selenium Webdriver" + Keys.ENTER)

time.sleep(30)