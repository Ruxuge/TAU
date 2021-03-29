import run_tests.firefox_tests as ft
import run_tests.chrome_tests as ct
import run_tests.opera_tests as ot


def firefox_test():
    ft.olx_t()
    ft.github_t()
    ft.pudelek_t()


def chrome_test():
    ct.olx_t()
    ct.github_t()
    ct.pudelek_t()


def opera_test():
    ot.olx_t()
    ot.pudelek_t()
    ot.github_t()


if __name__ == "__main__":
    opera_test()
    chrome_test()
    firefox_test()
