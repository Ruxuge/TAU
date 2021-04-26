import unittest
import json

from controller import print_help, print_one_command, print_parameter


class TestLinux(unittest.TestCase):

    def test_linux_help_is_work(self):
        driver = "../../linux_cmd.json"
        self.assertIsNotNone(json.dumps(print_help(driver), indent=4))

    def test_linux_help_is_return_text(self):
        driver = "../../linux_cmd.json"
        json_string = {
            "ls": {
                "name": "ls",
                "description": "list directory contents",
                "args": {
                    "-a": "do not ignore entries starting with .",
                    "-b": "print C-style escapes for nongraphic characters"
                }
            },
            "rm": {
                "name": "rm",
                "description": "remove files or directories",
                "args": {
                    "-i": "prompt before every removal",
                    "-r": "remove directories and their contents recursively"
                }
            },
            "cd": {
                "name": "cd",
                "description": "change the working directory",
                "args": {
                    "-l": "Handle the operand dot-dot logically",
                    "-p": "Handle the operand dot-dot physically"
                }
            },
            "cp": {
                "name": "cp",
                "description": "copy files and directories",
                "args": {
                    "-l": "always follow symbolic links in SOURCE",
                    "-r": "copy directories recursively"
                }
            },
            "tree": {
                "name": "tree",
                "description": "List the contents of a tree object",
                "args": {
                    "-d": "Show only the named tree entry itself, not its children.",
                    "-r": "Recurse into sub-trees."
                }
            }
        }

        expected = json.dumps(json_string, indent=4)
        result = json.dumps(print_help(driver), indent=4)
        self.assertEqual(result, expected)

    def test_linux_command_tree_is_not_none(self):
        driver = "../../linux_cmd.json"
        command = "tree"
        result = json.dumps((print_one_command(driver, command)), indent=4)
        self.assertIsNotNone(result)

    def test_linux_command_cp_args(self):
        driver = "../../linux_cmd.json"
        command = "cp"
        par = "args"
        result = json.dumps((print_parameter(driver, command, par)), indent=4)
        expected = json.dumps({
                    "-l": "always follow symbolic links in SOURCE",
                    "-r": "copy directories recursively"
                }, indent=4)
        self.assertEqual(result, expected)


if __name__ == '__main__':
    TestLinux.main()
