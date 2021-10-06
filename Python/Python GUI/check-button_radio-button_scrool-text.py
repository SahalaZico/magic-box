import tkinter as tk

# widget(Button, Checkbutton, Entry, Frame, Label, LabelFrame, Menubutton, PanedWindow, Radiobutton, Scale and Scrollbar)
from tkinter import ttk

from tkinter import scrolledtext

win = tk.Tk()

win.title("Pengpro")

a_label = ttk.Label(win, text="Enter a Name:")
a_label.grid(column=0, row=0)


def click_me():
    action.configure(text='Hello ' + name.get())


name = tk.StringVar()
name_entered = ttk.Entry(win, width=12, textvariable=name)
name_entered.grid(column=0, row=1)

ttk.Label(win, text='Choose a Number: ').grid(column=1, row=0)
number = tk.StringVar()
number_chosen = ttk.Combobox(win, width=12, textvariable=number)
number_chosen['values'] = (1, 2, 3, 42, 100,102)
number_chosen.grid(column=1, row=1)
number_chosen.current(2)

chVarDis = tk.IntVar()
check1 = tk.Checkbutton(win, text="Disable",
                        variable=chVarDis, state='disable')
check1.select()
check1.grid(column=0, row=4, sticky=tk.W)

chVarUn = tk.IntVar()
check2 = tk.Checkbutton(win, text="Uncheck", variable=chVarUn)
check2.deselect()
check2.grid(column=1, row=4, sticky=tk.W)

chVarEn = tk.IntVar()
check3 = tk.Checkbutton(win, text="Uncheck", variable=chVarEn)
check3.select()
check3.grid(column=2, row=4, sticky=tk.W)

COLOR1 = "Blue"
COLOR2 = "Gold"
COLOR3 = "Red"


def radCall():
    radSel = radVar.get()
    if radSel == 1:
        win.configure(background=COLOR1)
    elif radSel == 2:
        win.configure(background=COLOR2)
    elif radSel == 3:
        win.configure(background=COLOR3)


radVar = tk.IntVar()
rad1 = tk.Radiobutton(win, text=COLOR1, variable=radVar,
                      value=1, command=radCall)
rad1.grid(column=0, row=5, sticky=tk.W, columnspan=3)

rad2 = tk.Radiobutton(win, text=COLOR2, variable=radVar,
                      value=2, command=radCall)
rad2.grid(column=1, row=5, sticky=tk.W, columnspan=3)

rad3 = tk.Radiobutton(win, text=COLOR3, variable=radVar,
                      value=3, command=radCall)
rad3.grid(column=2, row=5, sticky=tk.W, columnspan=3)


scrollw = 30
scrollh = 3
scr = scrolledtext.ScrolledText(win, width=scrollw, height=scrollh, wrap=tk.WORD)
scr.grid(column=0, columnspan=3)

action = tk.Button(win, text="Click Me!", command=click_me)
action.grid(column=2, row=1)
name_entered.focus()

win.mainloop()
