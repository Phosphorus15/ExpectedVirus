package net.steepout.music.badwin.ui;

import net.steepout.music.badwin.BadWindows;
import net.steepout.music.badwin.ListenerCallback;

public class MemoryReadPopup extends AbstractNativeDialog {

	/**
	 *
	 */
	private static final long serialVersionUID = -442480773361640006L;

	public MemoryReadPopup() {
		title = "Unity3D.exe - Ӧ�ó������ ";
		message = BadWindows.MessageBoxInterface.randomAddress() + " ָ�����õ� "
				+ BadWindows.MessageBoxInterface.randomAddress() + " �ڴ档���ڴ治��Ϊ read��\n\nҪ��ֹ�����뵥�� ��ȷ������";
		new Thread() {
			@Override
			public void run() {
				try {
					Thread.sleep(ListenerCallback.slpGlobal);
				} catch (InterruptedException e) {
				} finally {
					MemoryReadPopup.this.setVisible(false);
				}
			}
		}.start();
	}

}
