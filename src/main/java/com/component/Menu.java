package com.component;

import com.event.MenuEvent;
import com.utils.MenuButton;
import com.utils.Split;
import com.utils.scroll.ScrollBarCustom;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
import javax.swing.ImageIcon; 
import javax.swing.JLabel;
import net.miginfocom.swing.MigLayout;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;



public class Menu extends javax.swing.JPanel {
    private MenuButton selectedMenu;
    private MenuButton unSelectedMenu;
    private Animator animator;
    private MenuEvent event;
    public Menu() {
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        image = new com.utils.ImageAvatar();
        scroll = new javax.swing.JScrollPane();
        panelMenu = new javax.swing.JPanel();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(192, 227, 149));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        jLabel1.setText("ATBus");
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));

        image.setBorderSpace(2);
        image.setGradientColor1(new java.awt.Color(63, 109, 217));
        image.setGradientColor2(new java.awt.Color(192, 227, 149));
        image.setImage(new javax.swing.ImageIcon(getClass().getResource("/images/binhan.jpg"))); // NOI18N

        panelMenu.setOpaque(false);

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 208, Short.MAX_VALUE)
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 409, Short.MAX_VALUE)
        );

        scroll.setViewportView(panelMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(scroll))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.utils.ImageAvatar image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JScrollPane scroll;
    // End of variables declaration//GEN-END:variables

    private void init() {
        setOpaque(false);
        scroll.setViewportBorder(null); // loại bỏ khung viền của menu tab
        scroll.setBorder(null); // loại bỏ khung viền của menu tab
        scroll.getViewport().setOpaque(false); // xóa bỏ background xám
        scroll.setVerticalScrollBar(new ScrollBarCustom());
        panelMenu.setLayout(new MigLayout("wrap, fillx, inset 0", "[fill]")); // hiện toàn bộ bố cục menu
        TimingTarget target = new TimingTargetAdapter(){
            @Override
            public void timingEvent(float fraction) {
                selectedMenu.setAnimate(fraction);
                if(unSelectedMenu != null){
                    unSelectedMenu.setAnimate((1f - fraction)); // reset hiệu ứng khi click lần 2
                }
            }
            
        };
        animator = new Animator(300, target);
        animator.setAcceleration(.5f); // tăng tốc
        animator.setDeceleration(.5f); // giảm tốc độ
        animator.setResolution(0); // độ phân giải
    }
    
    public void initMenu(MenuEvent event) {
        this.event = event;
        // icon, tên, vị trí của các chức năng
        addMenu("trangchu", "Giới thiệu", 0);
        addMenu("tuyenduong", "Quản lý tuyến đường", 1);
        addMenu("lichtrinh", "Quản lý lịch trình", 2);
        addMenu("nhanvien","Quản lý nhân viên", 3);
        addMenu("khachhang", "Quản lý khách hàng", 4);
        addMenu("phuongtien", "Quản lý phương tiện", 5);
        addMenu("taixe", "Quản lý tài xế", 6);
        split("Thống kê");
        addMenu("thongke", "Thống kê doanh thu", 7);
        space();
        addMenu("trogiup", "Trợ giúp", 8);
        addMenu("doimatkhau", "Đổi mật khẩu", 9);
        addMenu("thoatchuongtrinh", "Thoát chương trình", 10);     
    }
    private void addMenu(String iconMenu, String text, int index) {
        MenuButton menu = new MenuButton(index);
        setFont(menu.getFont().deriveFont(Font.PLAIN, 14));
        menu.setIcon(new ImageIcon(getClass().getResource("/images/" + iconMenu + ".png")));
        menu.setText("" + text);
        menu.setBackground(new Color(192, 227, 149)); // hover nền xanh lá nhạt
        menu.setFont(new Font("sansserif", 1, 13)); // font chữ to, in đậm
        menu.setForeground(new Color(0, 0, 0)); // màu chữ (đen) của các chức năng hệ thống
        menu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!animator.isRunning()){
                    if(menu != selectedMenu){
                        unSelectedMenu = selectedMenu;
                        selectedMenu = menu;
                        animator.start();
                        event.menuSelected(index);
                    }
                }
            }
        });
        panelMenu.add(menu);
    }
    private void split(String name){
        panelMenu.add(new Split(name), "h 30");
    }
    
    private void space(){
        panelMenu.add(new JLabel(), "push");
    } // đưa log out xuống góc cuối màn hình
    
    public void setSelected(int index){
        for(Component com : panelMenu.getComponents()){
            MenuButton menu = (MenuButton) com;
            if(menu.getIndex() == index){
                if(menu != selectedMenu){
                    unSelectedMenu = selectedMenu;
                    selectedMenu = menu;
                    animator.start();
                    event.menuSelected(index);
                }
                break;
            }
        }
    }
}
