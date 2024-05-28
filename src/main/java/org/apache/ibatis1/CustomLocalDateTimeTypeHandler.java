package org.apache.ibatis1;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import org.springframework.stereotype.Component;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import cn.hutool.core.date.DateUtil;
/**
 * @author：HeGu
 * @date：2024/5/7
 */
//@Component
////定义转换器支持的JAVA类型
//@MappedTypes(LocalDateTime.class)
////定义转换器支持的数据库类型
//@MappedJdbcTypes(value = JdbcType.TIMESTAMP, includeNullJdbcType = true)
//public class CustomLocalDateTimeTypeHandler extends BaseTypeHandler<LocalDateTime> {
//    private final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(DateUtil.PATTERN_DATETIME);
//
//    @Override
//    public void setNonNullParameter(PreparedStatement ps, int i, LocalDateTime parameter, JdbcType jdbcType)
//            throws SQLException {
//        if (parameter != null) {
//            ps.setString(i, dateTimeFormatter.format(parameter));
//        }
//    }
//
//    @Override
//    public LocalDateTime getNullableResult(ResultSet rs, String columnName) throws SQLException {
//        String target = rs.getString(columnName);
//        if (StringUtil.isEmpty(target)) {
//            return null;
//        }
//        return LocalDateTime.parse(target, dateTimeFormatter);
//    }
//
//    @Override
//    public LocalDateTime getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
//        String target = rs.getString(columnIndex);
//        if (StringUtil.isEmpty(target)) {
//            return null;
//        }
//        return LocalDateTime.parse(target, dateTimeFormatter);
//    }
//
//    @Override
//    public LocalDateTime getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
//        String target = cs.getString(columnIndex);
//        if (StringUtil.isEmpty(target)) {
//            return null;
//        }
//        return LocalDateTime.parse(target, dateTimeFormatter);
//    }
//}