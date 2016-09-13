package com.edu.ccut.util;

import java.util.Date;
import java.util.Properties;
 
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.apache.log4j.Logger;

import com.edu.ccut.controller.UserController;

/**
 *@author zhongyuan
 *@date 2016年7月31日
 */
public class SendEmail {
	
    private static Logger logger = Logger.getLogger(SendEmail.class);

	public static final String HOST = "smtp.163.com";
    public static final String PROTOCOL = "smtp";   
    public static final int PORT = 25;
    public static final String FROM = "ccuttouch@163.com";//发件人的email
    public static final String PWD = "ccut152402dc";//发件人密码
     
    /**
     * 获取Session
     * @return
     */
    private static Session getSession() {
        Properties props = new Properties();
        props.put("mail.smtp.host", HOST);//设置服务器地址
        props.put("mail.store.protocol" , PROTOCOL);//设置协议
        props.put("mail.smtp.port", PORT);//设置端口
        props.put("mail.smtp.auth" , true);
         
        Authenticator authenticator = new Authenticator() {
 
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(FROM, PWD);
            }
             
        };
        Session session = Session.getDefaultInstance(props , authenticator);
         
        return session;
    }
     
    public static void send(String toEmail , String content) {
        Session session = getSession();
        try {
            logger.info("--send--"+content);
            // Instantiate a message
            Message msg = new MimeMessage(session);
  
            //Set message attributes
            msg.setFrom(new InternetAddress(FROM));
            InternetAddress[] address = {new InternetAddress(toEmail)};
            msg.setRecipients(Message.RecipientType.TO, address);
            msg.setSubject("账号激活邮件");
            msg.setSentDate(new Date());
            msg.setContent(content , "text/html;charset=utf-8");
  
            //Send the message
            Transport.send(msg);
        }
        catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }

}