import pytest

from main import control_input

testdata = [
    (5, "int_number"),
    ("wyraz", "string"),
    (-134, "int_number"),
    ("-23.65", "float_number"),
    ("34.89", "float_number"),
    ("345", "int_number"),
    (957485987, "int_number"),
    ("Kolejny wyraz65 45", "string"),
    ("7890.435", "float_number"),
    (0, "int_number")
]


@pytest.mark.parametrize("n1, result", testdata)
def test_input_controler(n1, result):
    assert control_input(n1) == result
